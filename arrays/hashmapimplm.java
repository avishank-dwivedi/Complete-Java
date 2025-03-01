package arrays;
import java.util.*;

public class hashmapimplm {
    static class HashMap<K, V> { // Generic class
        private static class Node<K, V> {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of key-value pairs
        private int N; // bucket size
        private LinkedList<Node<K, V>>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInidx(K key, int bi) {
            LinkedList<Node<K, V>> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Fix: Use equals() instead of ==
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node<K, V>>[] oldBuckets = buckets;
            N = 2 * N; // Double the size
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node<K, V>> ll : oldBuckets) {
                for (Node<K, V> node : ll) {
                    put(node.key, node.value); // Reinsert elements
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInidx(key, bi);

            if (di == -1) { // Key not present
                buckets[bi].add(new Node<>(key, value));
                n++;
            } else { // Key present, update value
                Node<K, V> data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInidx(key, bi);
            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInidx(key, bi);

            if (di == -1) {
                return null; // Key not found
            } else {
                return buckets[bi].get(di).value;
            }
        }

        public void remove(K key) {
            int bi = hashFunction(key);
            int di = searchInidx(key, bi);

            if (di != -1) {
                buckets[bi].remove(di);
                n--;
            }
        }

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("India", 120);
            map.put("China", 150);
            map.put("US", 30);
            map.put("China", 155); // Updates value

            System.out.println(map.get("India")); // 120
            System.out.println(map.get("China")); // 155
            System.out.println(map.get("US")); // 30
            System.out.println(map.containsKey("UK")); // false

            map.remove("China");
            System.out.println(map.get("China")); // null
        }
    }
}
