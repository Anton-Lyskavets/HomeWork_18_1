package JavaPVT.HW_18_1;

/*
Создать собственную аннотацию @SignCode c методами type
(значения PACKAGE, METHOD, FIELD, LOCAL_VARIABLE, CLASS, PARAMETER, CONSTRUCTOR)
и id(уникальное целое число).
Создать класс Person c полями фамилия, имя, год рождения, методом toString
и конструктором, принимающим фамилию, имя, год рождения, статическим методом,
который выводит значения аннотации @SignCode для всех проаннотированных
элементов c помощью рефлексии.
Проаннотировать аннотацией @SignCode все возможные элементы:
пакет, класс, поля, методы(включая конструктор), параметры методов(в конструкторе).
 */
public class Main {

    public static void main(String[] args) {
        Person.reflectionMethod();
    }
}
