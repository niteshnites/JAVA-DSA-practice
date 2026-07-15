public class Test {

    public Test() {
    }

    public static Test getTestInstance() {
        return new Test();
    }
}

class callTest {
    public static void main(String[] args) {
        Test.getTestInstance();
    }
}
