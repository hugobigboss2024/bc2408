package builderpattern;

class Person {
    // 缺點:
    // class的數量增加：使用BuilderPattern模式會增加class的數量，特別是當object的組件很多時。
    // 複雜性：對於簡單的object構建，使用BuilderPattern模式可能會過於複雜。
    private String name;
    private int age;
    private String address;
    // 3 private因此只能通過內部的 Builder 類來創建。

    // 建構函數是私有的，防止直接實例化
    private Person() {
    }

    // 內部靜態類，使用BuilderPattern模式進行構建
    public static class Builder {// Builder 類提供了設置 Person 屬性的方法
        private String name;
        private int age;
        private String address;

        // 每個方法都返回自身以便支持鏈式調用。
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {// build() 方法用於創建 Person 的實例。
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.address = this.address;
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
