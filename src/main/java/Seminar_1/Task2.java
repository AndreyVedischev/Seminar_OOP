package Seminar_1;

public class Task2 {
    public static void main(String[] args) {

    }
    class Human {
        private int id;
        private String gender;
        private String name;
        private String surname;
        private int age;
        private String status;
        public Human(int id, String gender, String name, String surname, int age, String status) {
            this.id = id;
            this.gender = gender;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.status = status;
        }
        public int getId() {
            return id;
        }
        public void setId() {
            this.id = id;
        }
        public String getGender() {
            return gender;
        }
        public void setGender() {
            this.gender = gender;
        }
        public String getName() {
            return name;
        }
        public void setName() {
            this.name = name;
        }
        public String getSurname() {
            return surname;
        }
        public void setSurname() {
            this.surname = surname;
        }
        public int getAge() {
            return age;
        }
        public void setAge() {
            this.age = age;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus() {
            this.status = status;
        }

        public String toString() {
            return String.format("id: %d, gender: %s, name: %s, surname: %s, age: %d, status: %s", this.id, this.gender, this.name, this.surname, this.age, this.status);
        }
    }
    class Research2 {

    }
}
