import java.util.Scanner;
public class Converter {
    public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceMetric) {
            case "km":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum * 1000;
                        break;
                    case "mile":
                        targetNum = sourceNum / (float) 1.6;
                        break;
                    default:
                        System.out.println("Your input is not handled, Please try again.");
                        return targetNum;
                }
                break;
            case "kg":
                switch (targetMetric) {
                    case "g":
                        targetNum = sourceNum * 1000;
                        break;
                    case "lb":
                        targetNum = sourceNum * (float) 2.2;
                        break;
                    default:
                        System.out.println("Your input is not handled, Please try again.");
                        return targetNum;
                }
                break;
            case "ft":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum / (float) 3.28;
                        break;
                    case "yd":
                        targetNum = sourceNum * (float) 0.33;
                        break;
                    default:
                        System.out.println("Your input is not handled, Please try again!");
                        return targetNum;
                }
                break;
            case "hr":
                switch (targetMetric) {
                    case "min":
                        targetNum = sourceNum * 60;
                        break;
                    case "sec":
                        targetNum = sourceNum / (float) .00027778;
                        break;
                    default:
                        System.out.println("Your input is not handled, Please try again!");
                        return targetNum;
                }
                break;
        }
        System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
        return targetNum;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str;
        String[] strArray;
        float sourceNum;
        String sourceMetric;
        String targetMetric;

        while (true) {
            System.out.println("Please input your metric to be converted:");
            str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Thank you. Goodbye");
                scanner.close();
                break;
            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("Your input is not valid. Please try again");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceMetric = strArray[1];
                targetMetric = strArray[3];
            }
            metricConverter(sourceMetric, targetMetric, sourceNum);
        }
        scanner.close();
    }
}
