class Main {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 15;
        int result = value1 + value2;
        System.out.println(result);

        Mage mage= new Mage(5,10,"sss", "ice");
        System.out.println(mage.getInfo());
    }
}