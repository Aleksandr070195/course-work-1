
public class Main {

        private static final Employee[] employees = new Employee[10];

        public static void main(String[] args) {

            for (int i = 0; i < employees.length; i++) {

                employees[0] = new Employee("Matkovsky Denis Aleksandrovich", "transport", 15000);
                employees[1] = new Employee("Petrov Ivan Petrovich", "marketing", 20000);
                employees[2] = new Employee("Ivanov Aleksey Sergeevich", "financial", 25000);
                employees[3] = new Employee("Jukova Natalia Petrovna", "supply", 30000);
                employees[4] = new Employee("Sergeeva Anna Aleksandrovna", "HR", 35000);
                employees[5] = new Employee("Popov Nikita Konstantinovich", "transport", 40000);
                employees[6] = new Employee("Volshin Dmitriy Sergeevich", "marketing", 45000);
                employees[7] = new Employee("Matveeva Olga Sergeevna", "financial", 50000);
                employees[8] = new Employee("Grekov Pavel Aleksandrovich", "supply", 55000);
                employees[9] = new Employee("Sidorov Roman Andreevich", "HR", 60000);
            }


            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println(getWageSalary());
            System.out.println(getMinWage());
            System.out.println(getMaxWage());
            System.out.println(getAverageWage());
            theWholeState();

        }

        private static double getWageSalary() {
            double salary = 0;
            for (Employee employee : employees) {
                salary += employee.getWage();

            }
            return salary;
        }

        private static Employee getMinWage() {
            double minWage = Double.MAX_VALUE;
            Employee minEmployee = null;
            for (Employee employee : employees) {
                if (minWage > employee.getWage()) {
                    minWage = employee.getWage();
                    minEmployee = employee;
                }
            }
            return minEmployee;
        }

        private static Employee getMaxWage() {
            double maxWage = Double.MIN_VALUE;
            Employee maxEmployee = null;
            for (Employee employee : employees) {
                if (maxWage < employee.getWage()) {
                    maxWage = employee.getWage();
                    maxEmployee = employee;
                }
            }
            return maxEmployee;
        }

        public static double getAverageWage() {
            double average = 0;
            for (Employee employee : employees) {
                average += employee.getWage() / employees.length;
            }
            return average;
        }

        private static void theWholeState() {
            for (Employee employee : employees) {
                System.out.println(employee.getFullName());

            }
        }
    }

