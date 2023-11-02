package abstractdemo;

public class Main {
    public static void main(String[] args) {
        son son1=new son(23);
        son1.career();
        son1.partner();
        parent mom=new parent(34) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };

    }
}
