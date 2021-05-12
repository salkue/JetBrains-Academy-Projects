package tictactoe;


import java.util.Scanner;

public class Main {
    public static void Printing(char[] array) {
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println("---------");
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[] array = new char[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = ' ';
        }
        Printing(array);
        boolean status = false;
        int counter = 1;
        char mark = 'X';
        while (!status) {
            System.out.print("Enter the coordinates:");
            String input = scanner.nextLine().replace(" ", "");
            char[] array2 = input.toCharArray();
            for (char c : array2) {
                if (!Character.isDigit(c)) {
                    System.out.println("You should enter numbers!");
                    break;
                }

                if (c < '1' || c > '3') {
                    System.out.println("Coordinates should be from 1 to 3!");
                    break;
                }

            }
            if (counter % 2 == 0) {
                mark = 'O';
            } else {
                mark = 'X';
            }

            if (input.equals("11") && array[0] == ' ') {
                array[0] = mark;
                counter++;
            } else {
                if (input.equals("12") && array[1] == ' ') {
                    array[1] = mark;
                    counter++;
                } else {
                    if (input.equals("13") && array[2] == ' ') {
                        array[2] = mark;
                        counter++;
                    } else {
                        if (input.equals("21") && array[3] == ' ') {
                            array[3] = mark;
                            counter++;
                        } else {
                            if (input.equals("22") && array[4] == ' ') {
                                array[4] = mark;
                                counter++;
                            } else {
                                if (input.equals("23") && array[5] == ' ') {
                                    array[5] = mark;
                                    counter++;
                                } else {
                                    if (input.equals("31") && array[6] == ' ') {
                                        array[6] = mark;
                                        counter++;
                                    } else {
                                        if (input.equals("32") && array[7] == ' ') {
                                            array[7] = mark;
                                            counter++;
                                        } else {
                                            if (input.equals("33") && array[8] == ' ') {
                                                array[8] = mark;
                                                counter++;
                                            } else {
                                                System.out.println("This cell is occupied! Choose another one!");
                                                status = false;
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Printing(array);
            boolean finish = true;
            boolean xWins = false;
            boolean oWins = false;
            int xCounter = 0;
            int oCounter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 'X') {
                    xCounter++;
                } else {
                    if (array[i] == 'O') {
                        oCounter++;
                    }

                }
                if (array[i] == ' ') {
                    finish = false;
                }
            }
            if (array[0] == array[1] && array[1] == array[2] && array[2] == 'X') {
                xWins = true;
            } else {
                if (array[0] == array[1] && array[1] == array[2] && array[2] == 'O') {
                    oWins = true;
                }

            }
            if (array[3] == array[4] && array[4] == array[5] && array[5] == 'X') {
                xWins = true;
            } else {
                if (array[3] == array[4] && array[4] == array[5] && array[5] == 'O') {
                    oWins = true;
                }

            }
            if (array[6] == array[7] && array[7] == array[8] && array[8] == 'X') {
                xWins = true;
            } else {
                if (array[6] == array[7] && array[7] == array[8] && array[8] == 'O') {
                    oWins = true;
                }

            }
            if (array[0] == array[4] && array[4] == array[8] && array[8] == 'X') {
                xWins = true;
            } else {
                if (array[0] == array[4] && array[4] == array[8] && array[8] == 'O') {
                    oWins = true;
                }

            }
            if (array[0] == array[3] && array[3] == array[6] && array[6] == 'X') {
                xWins = true;
            } else {
                if (array[0] == array[3] && array[3] == array[6] && array[6] == 'O') {
                    oWins = true;
                }

            }
            if (array[1] == array[4] && array[4] == array[7] && array[7] == 'X') {
                xWins = true;
            } else {
                if (array[1] == array[4] && array[4] == array[7] && array[7] == 'O') {
                    oWins = true;
                }

            }
            if (array[2] == array[5] && array[5] == array[8] && array[8] == 'X') {
                xWins = true;
            } else {
                if (array[2] == array[5] && array[5] == array[8] && array[8] == 'O') {
                    oWins = true;
                }

            }
            if (array[6] == array[4] && array[4] == array[2] && array[2] == 'X') {
                xWins = true;
            } else {
                if (array[6] == array[4] && array[4] == array[2] && array[2] == 'O') {
                    oWins = true;
                }

            }
//            if (xWins && oWins || Math.abs(xCounter - oCounter) >= 2) {
//                System.out.println("Impossible");
//                status=true;
//            } else {
            if (xWins) {
                System.out.println("X wins");
                status = true;
            } else {
                if (oWins) {
                    System.out.println("O wins");
                    status = true;
                } else {
                    if (finish) {
                        System.out.println("Draw");
                        status = true;
                    } else {
                        continue;
                    }

                }
            }
        }
    }
}