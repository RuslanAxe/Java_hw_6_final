// Задание
// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. 
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Laptop AsusTUFGamingF15FX507ZI = new Laptop("15.6", "Intel_Core_i7_12700H",
                "NVIDIA_GeForce_RTX4070", "16GB_(2x8)_DDR4_3200MHz", "1_TB_M.2",
                "Active", "YES", "Black");

        Laptop MSIKatana15B13VFK = new Laptop("16", "Intel_Core_i7_13620H",
                "NVIDIA_GeForce_RTX_4060", "16GB_(2x8)_DDR5", "1_TB_SSD",
                "Active", "YES", "Grey");

        Laptop LenovoLegion716IAX7 = new Laptop("15.6", "Intel_Core_i7_12800HX",
                "NVIDIA_GeForce_RTX_3070_Ti", "16GB_(2x8)_DDR4_3200MHz", "1_TB_SDD",
                "Active", "YES", "White");

        Laptop OMENHPGaming15dh = new Laptop("15.6", "Intel_Core_i9_10885H",
                "NVIDIA_GeForce_RTX_2080", "16GB_DDR4_3200MHz", "1_TB+SSD_512_Gb",
                "Active", "YES", "Black");

        Laptop AsusTUFGamingF15FX507ZI5_3 = new Laptop("15.6", "Intel_Corei7_12700H",
                "NVIDIA_GeForce_RTX4070", "16GB_(2x8)_DDR4_3200MHz", "1_TB_M.2",
                "Active", "YES", "Black");

        Laptop AsusTUFFX505DT = new Laptop("15.6", "AMD_Ryzen_7_3750H",
                "NVIDIA_GeForce_GTX_1650", "16GB_DDR4_3200MHz", "512_GB_SDD",
                "Active", "YES", "Black");

        Laptop AsusTUFFX505DT_2 = new Laptop("15.6", "AMD_Ryzen_7_3750H",
                "NVIDIA_GeForce_GTX_1650", "16GB_DDR4_3200MHz", "512_GB_SDD",
                "Active", "YES", "Black");


        List<Laptop> notebooks = new ArrayList<>();
        Collections.addAll(notebooks,
                AsusTUFGamingF15FX507ZI,
                MSIKatana15B13VFK,
                LenovoLegion716IAX7,
                OMENHPGaming15dh,
                AsusTUFGamingF15FX507ZI5_3,
                AsusTUFFX505DT,
                AsusTUFFX505DT_2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String input = scanner.nextLine();
        System.out.println(input);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер оперативной памяти: ");
        String minRAMSize = scanner.nextLine();

        for (Laptop notebook : notebooks) {
            if (notebook.hasRAMSize(minRAMSize)) {
                System.out.println(notebook);
            }
        }
        System.out.println("Извините, но ноута с такими параметрами не найдено :(");

    }
}
