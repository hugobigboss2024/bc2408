package builderpattern;

public class DatabaseConnection {// Construction of configuration objects
    private String ur1;
    private String name;
    private String password;
    private int port;// 端口??

    private DatabaseConnection(DBConnectionBuilder builder) {
        this.ur1 = builder.ur1;
        this.name = builder.name;
        this.password = builder.password;
        this.port = builder.port;
    }

    public static class DBConnectionBuilder {
        private String ur1;
        private String name;
        private String password;
        private int port = 0001;// 默認端口??

        public DBConnectionBuilder(String ur1) {
            this.ur1 = ur1;
        }

        public DBConnectionBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DBConnectionBuilder password(String password) {
            this.password = password;
            return this;
        }

        public DBConnectionBuilder port(int port) {
            this.port = port;
            return this;
        }

        public DatabaseConnection build() {
            return new DatabaseConnection(this);
        }
    }

}
