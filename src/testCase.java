public class testCase {
    public static class student{
        private String name;
        private int age;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) throws Exception {
            if("Male".equals(sex)||"Female".equals(sex)){
                this.sex = sex;
            }else{
                //throw new RuntimeException("Wrong sexual");
                //throw new Exception("Wrong sexual!");
            }
        }

        public student(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            try {
                this.setSex(sex);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public student() {
        }

        @Override
        public String   toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            student s = new student();
            s.setAge(19);
            s.setName("lili");
            try {
                s.setSex("dsdsds");
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(s);

            student s2 = new student("Feifei", 20, "sasw");
            System.out.println(s2);

        }
    }


}
