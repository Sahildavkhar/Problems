/*
 Java DSA Template Bank
 - Purpose: concise, copy-paste-ready Java templates for core DSA templates and common variants
 - Each method is a lean template. Fill edge cases / IO as needed for contest use.
*/

import java.util.*;

public class DsaTemplates {

    // -------------------- Helper Nodes --------------------
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int v) {
            val = v;
        }
    }

    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int v) {
            val = v;
        }
    }

    // -------------------- 1. ARRAYS --------------------

    // Two pointers (start-end)
    public static int twoPointersSum(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int s = a[l] + a[r];
            if (s == target)
                return l; // example return index
            if (s < target)
                l++;
            else
                r--;
        }
        return -1;
    }

    // Two pointers (fast-slow) - remove duplicates in-place
    public static int removeDuplicatesSorted(int[] a) {
        if (a.length == 0)
            return 0;
        int slow = 0;
        for (int fast = 1; fast < a.length; fast++) {
            if (a[fast] != a[slow])
                a[++slow] = a[fast];
        }
        return slow + 1;
    }

    // Sliding window (variable size) - longest unique substring length pattern
    public static int slidingWindowUnique(String s) {
        int n = s.length();
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            ans = Math.max(ans, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return ans;
    }

    // Prefix sum template
    public static int rangeSum(int[] pref, int l, int r) { // pref is 1-based prefix
        return pref[r] - pref[l - 1];
    }

    // Kadane's algorithm
    public static int kadaneMaxSubarray(int[] a) {
        int best = a[0], cur = a[0];
        for (int i = 1; i < a.length; i++) {
            cur = Math.max(a[i], cur + a[i]);
            best = Math.max(best, cur);
        }
        return best;
    }

    // Dutch National Flag (3-way partition)
    public static void dutchFlag(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0)
                swap(a, low++, mid++);
            else if (a[mid] == 1)
                mid++;
            else
                swap(a, mid, high--);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // Binary search standard (first occurrence variant)
    public static int lowerBound(int[] a, int target) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] < target)
                l = m + 1;
            else
                r = m;
        }
        return l; // index of first >= target
    }

    // Binary search on answer (predicate pattern)
    public static int binarySearchOnAnswer(int low, int high, java.util.function.IntPredicate feasible) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (feasible.test(mid))
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    // Matrix traversal - spiral skeleton
    public static List<Integer> spiralOrder(int[][] m) {
        List<Integer> res = new ArrayList<>();
        if (m.length == 0)
            return res;
        int top = 0, left = 0, bottom = m.length - 1, right = m[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)
                res.add(m[top][j]);
            top++;
            for (int i = top; i <= bottom; i++)
                res.add(m[i][right]);
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    res.add(m[bottom][j]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(m[i][left]);
                left++;
            }
        }
        return res;
    }

    // -------------------- 2. STRINGS --------------------

    // Two pointers palindrome check
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    // Hashmap freq count / anagram check
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        int[] cnt = new int[256];
        for (char c : a.toCharArray())
            cnt[c]++;
        for (char c : b.toCharArray())
            if (--cnt[c] < 0)
                return false;
        return true;
    }

    // KMP prefix table (lps)
    public static int[] buildKmpLps(String p) {
        int n = p.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (p.charAt(i) == p.charAt(len))
                lps[i++] = ++len;
            else if (len != 0)
                len = lps[len - 1];
            else
                lps[i++] = 0;
        }
        return lps;
    }

    // Rabin-Karp rolling hash skeleton (uses mod)
    public static int rabinKarpFind(String s, String p) {
        // skeleton: compute rolling hash and compare
        return -1; // implement as needed
    }

    // Manacher's algorithm skeleton
    public static int manacherLongestPalindrome(String s) {
        // return length of longest palindromic substring
        return 0; // implement when practicing
    }

    // Trie basic insert & search
    public static class TrieNode {
        TrieNode[] next = new TrieNode[26];
        boolean end = false;
    }

    public static void trieInsert(TrieNode root, String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (cur.next[idx] == null)
                cur.next[idx] = new TrieNode();
            cur = cur.next[idx];
        }
        cur.end = true;
    }

    public static boolean trieSearch(TrieNode root, String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (cur.next[idx] == null)
                return false;
            cur = cur.next[idx];
        }
        return cur.end;
    }

    // -------------------- 3. LINKED LISTS --------------------

    // Floyd's cycle detection
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // Find middle node
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Reverse linked list (iterative)
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode nx = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nx;
        }
        return prev;
    }

    // Reverse k-group skeleton
    public static ListNode reverseKGroup(ListNode head, int k) {
        // standard template: check k nodes, reverse, recurse/iterate
        return head; // practice when applying
    }

    // Merge two sorted lists
    public static ListNode mergeTwo(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                cur.next = a;
                a = a.next;
            } else {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        cur.next = (a != null) ? a : b;
        return dummy.next;
    }

    // Merge K sorted lists - PQ variant
    public static ListNode mergeKLists(List<ListNode> lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((x, y) -> x.val - y.val);
        for (ListNode n : lists)
            if (n != null)
                pq.add(n);
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (!pq.isEmpty()) {
            ListNode t = pq.poll();
            cur.next = t;
            cur = cur.next;
            if (t.next != null)
                pq.add(t.next);
        }
        return dummy.next;
    }

    // Add two numbers (digitwise)
    public static ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0), cur = dummy;
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            int s = carry + (a != null ? a.val : 0) + (b != null ? b.val : 0);
            carry = s / 10;
            cur.next = new ListNode(s % 10);
            cur = cur.next;
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;
        }
        return dummy.next;
    }

    // -------------------- 4. STACKS --------------------

    // Monotonic stack - next greater element
    public static int[] nextGreater(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[i] > a[st.peek()])
                ans[st.pop()] = a[i];
            st.push(i);
        }
        return ans;
    }

    // Valid parentheses
    public static boolean validParentheses(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;
                char t = st.pop();
                if ((c == ')' && t != '(') || (c == ']' && t != '[') || (c == '}' && t != '{'))
                    return false;
            }
        }
        return st.isEmpty();
    }

    // Min stack template
    public static class MinStack {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> mins = new ArrayDeque<>();

        public void push(int x) {
            stack.push(x);
            if (mins.isEmpty() || x <= mins.peek())
                mins.push(x);
        }

        public void pop() {
            int v = stack.pop();
            if (v == mins.peek())
                mins.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return mins.peek();
        }
    }

    // Infix -> postfix skeleton (Shunting-yard)
    public static String infixToPostfix(String expr) {
        // implement using operator stack and output queue - template
        return "";
    }

    // Evaluate postfix expression
    public static int evalPostfix(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for (String t : tokens) {
            if ("+ - * /".contains(t)) {
                int b = st.pop(), a = st.pop();
                switch (t) {
                    case "+":
                        st.push(a + b);
                        break;
                    case "-":
                        st.push(a - b);
                        break;
                    case "*":
                        st.push(a * b);
                        break;
                    case "/":
                        st.push(a / b);
                        break;
                }
            } else
                st.push(Integer.parseInt(t));
        }
        return st.pop();
    }

    // -------------------- 5. QUEUES --------------------

    // BFS traversal (graph) skeleton
    public static void bfsGraph(List<Integer>[] adj, int start) {
        boolean[] vis = new boolean[adj.length];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        vis[start] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u])
                if (!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                }
        }
    }

    // Sliding window max (deque)
    public static int[] slidingWindowMax(int[] a, int k) {
        int n = a.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i])
                dq.pollLast();
            dq.add(i);
            if (i >= k - 1)
                ans[i - k + 1] = a[dq.peek()];
        }
        return ans;
    }

    // Circular queue simple implementation
    public static class CircularQueue {
        int[] arr;
        int head = 0, tail = 0, size = 0;

        public CircularQueue(int n) {
            arr = new int[n];
        }

        public boolean offer(int x) {
            if (size == arr.length)
                return false;
            arr[tail] = x;
            tail = (tail + 1) % arr.length;
            size++;
            return true;
        }

        public Integer poll() {
            if (size == 0)
                return null;
            int v = arr[head];
            head = (head + 1) % arr.length;
            size--;
            return v;
        }
    }

    // LRU cache template using LinkedHashMap (simple variant)
    public static class LruCache<K, V> extends LinkedHashMap<K, V> {
        int cap;

        public LruCache(int c) {
            super(c, 0.75f, true);
            cap = c;
        }

        protected boolean removeEldestEntry(Map.Entry<K, V> e) {
            return size() > cap;
        }
    }

    // -------------------- 6. TREES --------------------

    // DFS traversals - recursive
    public static void preOrder(TreeNode r) {
        if (r == null)
            return;
        System.out.println(r.val);
        preOrder(r.left);
        preOrder(r.right);
    }

    public static void inOrder(TreeNode r) {
        if (r == null)
            return;
        inOrder(r.left);
        System.out.println(r.val);
        inOrder(r.right);
    }

    public static void postOrder(TreeNode r) {
        if (r == null)
            return;
        postOrder(r.left);
        postOrder(r.right);
        System.out.println(r.val);
    }

    // BFS level order
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            List<Integer> level = new ArrayList<>();
            while (sz-- > 0) {
                TreeNode n = q.poll();
                level.add(n.val);
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
            res.add(level);
        }
        return res;
    }

    // Height/Depth calc
    public static int treeHeight(TreeNode r) {
        if (r == null)
            return 0;
        return 1 + Math.max(treeHeight(r.left), treeHeight(r.right));
    }

    // Lowest Common Ancestor (recursion for binary tree)
    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if (left != null && right != null)
            return root;
        return left != null ? left : right;
    }

    // Serialize/deserialize skeleton
    public static String serialize(TreeNode root) { // BFS based
        // implement as needed
        return "";
    }

    // Validate BST
    public static boolean validateBST(TreeNode root) {
        return validateBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validateBSTHelper(TreeNode r, long lo, long hi) {
        if (r == null)
            return true;
        if (r.val <= lo || r.val >= hi)
            return false;
        return validateBSTHelper(r.left, lo, r.val) && validateBSTHelper(r.right, r.val, hi);
    }

    // Insert/Delete in BST skeleton
    public static TreeNode bstInsert(TreeNode root, int v) {
        if (root == null)
            return new TreeNode(v);
        if (v < root.val)
            root.left = bstInsert(root.left, v);
        else
            root.right = bstInsert(root.right, v);
        return root;
    }

    // -------------------- 7. HEAPS --------------------

    // Heapify / build heap using PriorityQueue (Java offers heap API)
    public static PriorityQueue<Integer> makeMinHeap(int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : a)
            pq.add(x);
        return pq;
    }

    // Top-K elements (min-heap variant)
    public static int[] topK(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : a) {
            pq.add(x);
            if (pq.size() > k)
                pq.poll();
        }
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--)
            ans[i] = pq.poll();
        return ans;
    }

    // Median of data stream (two heaps)
    public static class MedianFinder {
        PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> high = new PriorityQueue<>();

        public void addNum(int num) {
            if (low.isEmpty() || num <= low.peek())
                low.add(num);
            else
                high.add(num);
            balance();
        }

        private void balance() {
            if (low.size() > high.size() + 1)
                high.add(low.poll());
            if (high.size() > low.size())
                low.add(high.poll());
        }

        public double findMedian() {
            if (low.size() > high.size())
                return low.peek();
            return (low.peek() + high.peek()) / 2.0;
        }
    }

    // -------------------- 8. HASHING --------------------

    // Hashmap frequency count template
    public static Map<Integer, Integer> freqMap(int[] a) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : a)
            m.put(x, m.getOrDefault(x, 0) + 1);
        return m;
    }

    // Two sum using hashmap
    public static int[] twoSumHash(int[] a, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int need = target - a[i];
            if (m.containsKey(need))
                return new int[] { m.get(need), i };
            m.put(a[i], i);
        }
        return null;
    }

    // Group anagrams (hash by sorted string)
    public static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : arr) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String k = new String(cs);
            m.computeIfAbsent(k, kk -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(m.values());
    }

    // Subarray sum = K (prefix + hashmap)
    public static int subarraySum(int[] a, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        int sum = 0, ans = 0;
        for (int x : a) {
            sum += x;
            ans += m.getOrDefault(sum - k, 0);
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    // LRU cache variant shown earlier via LinkedHashMap

    // -------------------- 9. GRAPHS --------------------

    // DFS recursive
    public static void dfsRec(List<Integer>[] adj, int u, boolean[] vis) {
        vis[u] = true;
        for (int v : adj[u])
            if (!vis[v])
                dfsRec(adj, v, vis);
    }

    // DFS iterative
    public static void dfsIter(List<Integer>[] adj, int start) {
        boolean[] vis = new boolean[adj.length];
        Deque<Integer> st = new ArrayDeque<>();
        st.push(start);
        while (!st.isEmpty()) {
            int u = st.pop();
            if (vis[u])
                continue;
            vis[u] = true;
            for (int v : adj[u])
                if (!vis[v])
                    st.push(v);
        }
    }

    // Union-Find with path compression
    public static class DSU {
        int[] p, r;

        public DSU(int n) {
            p = new int[n];
            r = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = i;
        }

        public int find(int x) {
            if (p[x] == x)
                return x;
            return p[x] = find(p[x]);
        }

        public boolean unite(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b)
                return false;
            if (r[a] < r[b])
                p[a] = b;
            else if (r[a] > r[b])
                p[b] = a;
            else {
                p[b] = a;
                r[a]++;
            }
            return true;
        }
    }

    // Dijkstra's algorithm (pq)
    public static int[] dijkstra(List<int[]>[] adj, int src) {
        int n = adj.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        pq.add(new int[] { src, 0 });
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0], d = cur[1];
            if (d != dist[u])
                continue;
            for (int[] e : adj[u]) {
                int v = e[0], w = e[1];
                if (dist[v] > d + w) {
                    dist[v] = d + w;
                    pq.add(new int[] { v, dist[v] });
                }
            }
        }
        return dist;
    }

    // Bellman-Ford skeleton
    public static int[] bellmanFord(int n, int[][] edges, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int[] e : edges) {
                int u = e[0], v = e[1], w = e[2];
                if (dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + w)
                    dist[v] = dist[u] + w;
            }
        }
        // detect negative cycle optionally
        return dist;
    }

    // Floyd-Warshall skeleton
    public static int[][] floydWarshall(int n, int[][] w) {
        int INF = 1_000_000_000;
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                d[i][j] = (i == j ? 0 : (w[i][j] == 0 ? INF : w[i][j]));
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
        return d;
    }

    // Kruskal's MST skeleton uses DSU

    // Topological sort (Kahn's algorithm)
    public static int[] topoKahn(List<Integer>[] adj) {
        int n = adj.length;
        int[] indeg = new int[n];
        for (int u = 0; u < n; u++)
            for (int v : adj[u])
                indeg[v]++;
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++)
            if (indeg[i] == 0)
                q.add(i);
        int idx = 0;
        int[] order = new int[n];
        while (!q.isEmpty()) {
            int u = q.poll();
            order[idx++] = u;
            for (int v : adj[u]) {
                indeg[v]--;
                if (indeg[v] == 0)
                    q.add(v);
            }
        }
        return (idx == n) ? order : null; // null if cycle
    }

    // -------------------- 10. DYNAMIC PROGRAMMING --------------------

    // Fibonacci - memo & tab
    public static long fibMemo(int n, long[] mem) {
        if (n <= 1)
            return n;
        if (mem[n] != -1)
            return mem[n];
        return mem[n] = fibMemo(n - 1, mem) + fibMemo(n - 2, mem);
    }

    public static long fibTab(int n) {
        if (n <= 1)
            return n;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    // 1D DP - climb stairs
    public static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // 2D DP - unique paths
    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                dp[j] += dp[j - 1];
        return dp[n - 1];
    }

    // 0/1 knapsack skeleton (iterative)
    public static int knapsack01(int W, int[] wt, int[] val) {
        int n = wt.length;
        int[] dp = new int[W + 1];
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= wt[i]; w--)
                dp[w] = Math.max(dp[w], dp[w - wt[i]] + val[i]);
        }
        return dp[W];
    }

    // LIS O(n log n) skeleton
    public static int lisNlogN(int[] a) {
        List<Integer> tails = new ArrayList<>();
        for (int x : a) {
            int i = Collections.binarySearch(tails, x);
            if (i < 0)
                i = -i - 1;
            if (i == tails.size())
                tails.add(x);
            else
                tails.set(i, x);
        }
        return tails.size();
    }

    // Interval DP and Tree DP: provide templates when practicing specific problems

    // -------------------- 11. BACKTRACKING --------------------

    // Generate subsets
    public static List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackSubsets(a, 0, new ArrayList<>(), res);
        return res;
    }

    private static void backtrackSubsets(int[] a, int idx, List<Integer> cur, List<List<Integer>> res) {
        if (idx == a.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(a[idx]);
        backtrackSubsets(a, idx + 1, cur, res);
        cur.remove(cur.size() - 1);
        backtrackSubsets(a, idx + 1, cur, res);
    }

    // Permutations
    public static List<List<Integer>> permutations(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[a.length];
        backperm(a, new ArrayList<>(), used, res);
        return res;
    }

    private static void backperm(int[] a, List<Integer> cur, boolean[] used, List<List<Integer>> res) {
        if (cur.size() == a.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < a.length; i++)
            if (!used[i]) {
                used[i] = true;
                cur.add(a[i]);
                backperm(a, cur, used, res);
                cur.remove(cur.size() - 1);
                used[i] = false;
            }
    }

    // N-Queens skeleton: place and backtrack

    // -------------------- 12. GREEDY --------------------

    // Interval scheduling (sort by end)
    public static int intervalSchedule(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> x[1] - y[1]);
        int last = -1, cnt = 0;
        for (int[] in : intervals) {
            if (in[0] > last) {
                cnt++;
                last = in[1];
            }
        }
        return cnt;
    }

    // Fractional knapsack skeleton - sort by ratio

    // -------------------- 13. SORTING & SEARCHING --------------------

    // Quick sort (in-place)
    public static void quickSort(int[] a) {
        qs(a, 0, a.length - 1);
    }

    private static void qs(int[] a, int l, int r) {
        if (l >= r)
            return;
        int p = partition(a, l, r);
        qs(a, l, p - 1);
        qs(a, p + 1, r);
    }

    private static int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (a[j] < pivot)
                swap(a, i++, j);
        }
        swap(a, i, r);
        return i; 
    }

    // Merge sort
    public static void mergeSort(int[] a) {
        if (a.length < 2)
            return;
        int mid = a.length / 2;
        int[] l = Arrays.copyOfRange(a, 0, mid);
        int[] r = Arrays.copyOfRange(a, mid, a.length);
        mergeSort(l);
        mergeSort(r);
        merge(a, l, r);
    }

    private static void merge(int[] a, int[] l, int[] r) {
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length)
            a[k++] = l[i] <= r[j] ? l[i++] : r[j++];
        while (i < l.length)
            a[k++] = l[i++];
        while (j < r.length)
            a[k++] = r[j++];
    }

    // Counting/radix sort: skeleton for integers

    // Binary search variants illustrated earlier

    // -------------------- 14. BIT MANIPULATION --------------------

    // Count set bits - Brian Kernighan
    public static int countBits(int x) {
        int cnt = 0;
        while (x > 0) {
            x &= (x - 1);
            cnt++;
        }
        return cnt;
    }

    // XOR trick - single number
    public static int singleNumber(int[] a) {
        int x = 0;
        for (int v : a)
            x ^= v;
        return x;
    }

    // Subset generation using bitmask
    public static List<List<Integer>> subsetsBitmask(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        int n = a.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> cur = new ArrayList<>();
            for (int i = 0; i < n; i++)
                if (((mask >> i) & 1) == 1)
                    cur.add(a[i]);
            res.add(cur);
        }
        return res;
    }

    // -------------------- 15. MATH --------------------

    // GCD / LCM
    public static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    // Modular exponentiation
    public static long modPow(long a, long e, long mod) {
        long res = 1 % mod;
        a %= mod;
        while (e > 0) {
            if ((e & 1) == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            e >>= 1;
        }
        return res;
    }

    // Sieve of Eratosthenes
    public static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int p = 2; p * p <= n; p++)
            if (prime[p])
                for (int q = p * p; q <= n; q += p)
                    prime[q] = false;
        return prime;
    }

    // Matrix exponentiation skeleton

    // -------------------- End of Template Bank --------------------

    public static void main(String[] args) {
        // quick smoke: test some templates here while practicing
    }
}