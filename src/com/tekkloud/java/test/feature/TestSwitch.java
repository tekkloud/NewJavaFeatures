package com.tekkloud.java.test.feature;

public class TestSwitch {

    public static void main(String[] args) {
        int resultLambda = testSwitchWithLambda("test");
        int resultYield = testSwitchWithYield("a");
        System.out.println(resultLambda);
        System.out.println(resultYield);
    }

    private static int testSwitchWithYield(String input) {
        {
            return switch (input) {
                case "a", "b":
                    yield 1;
                case "test":
                    yield 2;
                case "omg":
                    yield 3;
                case "np":
                    System.out.println("This is multiline lamba");
                    yield 9;
                default:
                    yield 0;
            };
        }

    }

    private static int testSwitchWithLambda(String input) {
        return switch (input) {
            case "a", "b" -> 1;
            case "test" -> 2;
            case "omg" -> 3;
            case "np" -> {
                System.out.println("This is multiline lamba");
                yield 9;
            }
            default -> 0;
        };
    }
}
