class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char zadanie;

        do {
            System.out.println();
            System.out.println();
            System.out.print(
                    "[a] Налитов Андрей |Подсчет количества гласных букв в строке|\n" +
                            "[b] Андриянов Влад |Привидение всех букв к верхнему и нижнему регистру|\n" +
                            "[c] Шумский Илья |Удаление всех знаков препинания и служебных символов (кроме пробела) из строки|\n\n" +
                            "Введите букву задания или 'q' для выхода: "
            );
            zadanie = scanner.nextLine().charAt(0);

            switch (zadanie) {
                case 'a':
                    Nalitov_a.str_in_and_out();
                    break;
                case 'b':
                    Andriyanov_b.register_bukv();
                    break;
                case 'c':
                    Shumskiy_C.znaki_prep();
                    break;
                case 'q':
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        } while (zadanie != 'q');

    }
}
