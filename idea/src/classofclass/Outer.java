package idea.src.classofclass;

public class Outer {// !!!this is outside class!!!
    // inside class have static,inside class belong to inside class self
    // inside class not have static,inside class belong to outside class
    public static int o = 100;
    private String hobby;

    public static class Inner {// class in class same of just one class//!!!this is inside class!!!

        private String name;
        private int age;
        public static String schoolName;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("name:" + name);
            System.out.println(o);// class in class can no need to (Outer.0)
            // System.out.println(hobby);//inside class cant connect outside class private
            // things
            // if want to connect outside class private things, need to new a outside class
            // object
            Outer o = new Outer();
            System.out.println(o.hobby);

        }

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

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

    }

    public class Inner2 {
        // EG:outside class is People, inside class is heart. like that things class
        /// if inside class not a public staticclass,just like(public class Inner),want
        /// to new inside class object
        /// Outer.Inner in = new Outer().Inner();
        private String name;
        private int age;
        public static int a = 100;

        public Inner2() {
        }

        public Inner2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("name" + name);
        }

        public static void test() {
            System.out.println(a);
        }

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

    }
    //
}
