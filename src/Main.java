    //package cc37;
     
    import java.util.*;
    import java.io.*;
     
    public class Main {
    FastScanner in;
    PrintWriter out;
     
    final int maxk = (int) 1e5 + 1;
    public void solve() throws IOException {
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];
    int k = (int) Math.sqrt(n);
    int[][] pre = new int[k+20][maxk];
    int cur = 0;
    for (int i = 0 ; i < n; i++) {
    if ((i > 0) && (i % k == 0)) {
    cur++;
    }
    a[i] = in.nextInt();
    int l = (int) Math.sqrt(a[i]);
    for (int j = 1; j <= l; j++) {
    if (a[i] % j == 0) {
    if (j * j != a[i]) {
    pre[cur][j]++;
    pre[cur][a[i]/j]++;
    } else {
    pre[cur][j]++;
    }
    }
    }
    }
    for (int i = 0; i < m; i++) {
    int l = in.nextInt() - 1;
    int r = in.nextInt() - 1;
    int d = in.nextInt();
    int ans = 0;
    int lblock = l / k;
    int rblock = r / k;
    for (int j = lblock + 1; j < rblock; j++) {
    ans += pre[j][d];
    }
    int j = 0;
    for (j = l; (j / k == l / k) && (j <= r) ; j++) {
    if (a[j] % d == 0) {
    ans++;
    }
    }
    if (j > r) {
    out.println(ans);
    continue;
    }
    for (j = r; (j / k) == (r / k); j--) {
    if (a[j] % d == 0) {
    ans++;
    }
    }
    out.println(ans);
    }
    }
     
    public void run() {
    try {
    in = new FastScanner(System.in);
    out = new PrintWriter(System.out);
     
    solve();
     
    out.close();
    } catch (IOException e) {
    e.printStackTrace();
    }
    }
     
    class FastScanner {
    BufferedReader br;
    StringTokenizer st;
     
    FastScanner(File f) {
    try {
    br = new BufferedReader(new FileReader(f));
    } catch (FileNotFoundException e) {
    e.printStackTrace();
    }
    }
     
    public FastScanner(InputStream in) {
    br = new BufferedReader(new InputStreamReader(in));
    }
     
    String next() {
    while (st == null || !st.hasMoreTokens()) {
    try {
    st = new StringTokenizer(br.readLine());
    } catch (IOException e) {
    e.printStackTrace();
    }
    }
    return st.nextToken();
    }
     
    int nextInt() {
    return Integer.parseInt(next());
    }
     
    long nextLong() {
    return Long.parseLong(next());
    }
    }
     
    public static void main(String[] arg) {
    new Main().run();
    }
    } 