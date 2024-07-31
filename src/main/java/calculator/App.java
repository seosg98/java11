package calculator;

public class App {

    public static void main(String[] args) {
        System.out.println("xoxo");
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Integer> al = new ArrayList<>();

        while (flag) {
            int num1 = 0, num2 = 0;
            char operator = ' ';
            int result = 0;

            // 1. 두 개의 양의 정수를 입력받는다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();

            // 2. 사칙연산 기호를 입력받는다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            operator = sc.next().charAt(0);

            // 3. 연산을 수행하고 결과를 저장한다.
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                        continue; // 다음 반복으로 넘어감
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자를 선택하셨습니다.");
                    continue; // 다음 반복으로 넘어감
            }

            System.out.println("결과: " + result);
            al.add(result);

            // 4. 가장 먼저 저장된 연산 결과를 삭제할지 물어본다.
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.next().equals("remove")) {
                if (!al.isEmpty()) {
                    al.remove(0);
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
            }

            // 5. 저장된 연산 결과를 조회할지 물어본다.
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                System.out.print("연산 결과 \n[");
                int count = 0;
                for (int num : al) {
                    System.out.print(num);
                    if (count < al.size() - 1) {
                        System.out.print(", ");
                    }
                    count++;
                }
                System.out.println("]");
            }

            // 6. 계속 계산할지 물어본다.
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")) flag = false;
        }
        sc.close();
    }import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public static void main(String[] args) {
            List<Double> results = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("계산식을 입력하세요 (예: 2 + 2) 또는 종료하려면 'exit' 입력:");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    double result = evaluateExpression(input);
                    results.add(result);
                    System.out.println("결과: " + result);
                } catch (Exception e) {
                    System.out.println("잘못된 계산식입니다. 다시 시도해주세요.");
                    continue;
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("remove")) {
                    if (!results.isEmpty()) {
                        results.remove(0);
                        System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
                    } else {
                        System.out.println("저장된 연산 결과가 없습니다.");
                    }
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("inquiry")) {
                    if (!results.isEmpty()) {
                        System.out.println("저장된 연산 결과:");
                        for (int i = 0; i < results.size(); i++) {
                            System.out.println((i + 1) + ": " + results.get(i));
                        }
                    } else {
                        System.out.println("저장된 연산 결과가 없습니다.");
                    }
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            scanner.close();
            System.out.println("프로그램을 종료합니다.");
        }

        private static double evaluateExpression(String expression) {
            String[] tokens = expression.split(" ");
            double operand1 = Double.parseDouble(tokens[0]);
            String operator = tokens[1];
            double operand2 = Double.parseDouble(tokens[2]);

            switch (operator) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    return operand1 / operand2;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
        }
    }



}

    }
}
