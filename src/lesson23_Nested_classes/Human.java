package lesson23_Nested_classes;

public class Human {
    private Pass pass;
    private Heart heart;

    public Human(String id, String numbers, PassType passType) {
        this.pass = new Pass (id,numbers,passType);
        this.heart = new Heart(285.02);
    }

    @Override
    public String toString() {
        return "Human{" +
                "pass=" + pass +
                ", heart=" + heart +
                '}';
    }

    public static class  Pass{
        private String id;
        private String numbers;
        private PassType passType;

        public Pass(String id, String numbers, PassType passType) {
            this.id = id;
            this.numbers = numbers;
            this.passType = passType;
        }

        @Override
        public String toString() {
            return "Pass{" +
                    "id='" + id + '\'' +
                    ", numbers='" + numbers + '\'' +
                    ", passType=" + passType +
                    '}';
        }
    }

    public class Heart {

        private double weight;

        public Heart(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    '}';
        }
    }
}

