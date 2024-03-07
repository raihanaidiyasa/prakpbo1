public class Test1 {
    public static void main(String[] args) {
        System.out.println("What's wrong with this program?");
    }
}

class TestAnother1 {
    public static void main(String[] args) {
        System.out.println("What's wrong with this program?");
    }
}

/* Penggunaan "public" pada awalan nama kelas diharuskan kelas yang namanya sama dengan nama file. Apabila ada dua kelas
* dan keduanya menggunakan public, maka program tidak bisa di-run. Perbaikan yang saya lakukan adalah menghapus "public"
* pada class TestAnother1
*/