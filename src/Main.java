import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student num1 = new Student("Nurtilek", 18, "Java");
        Student num2 = new Student("Nurmuhammed", 17, "Java");
        Student num3 = new Student("Erlan", 16, "JS");
        Student num4 = new Student("Almaz", 19, "JS");
        Student num5 = new Student("Bekzat", 18, "Java");
        Student[] nums = {num1, num2, num3, num4, num5};

        int age1 = num1.age + num2.age + num3.age + num4.age + num5.age;
        int age2 = age1 /nums.length;

        System.out.println("Sredniy vozrast "+"  " + age2);

        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].group.contains("Java")) {
                ++n1;
            } else {
                ++n2;

            }
                System.out.println("Java" + " " + n1);
                System.out.println("JS " + " " + n2);


            }


        }

    }
