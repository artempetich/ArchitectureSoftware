package creational_patterns.builder;

/**
 * Создайте абстрактный класс/интерфейс CarBuilder, в котором определите все необходимые шаги для создания автомобиля.
 * Обратите внимание, что я сделал тип CarBuilder типом возврата всех этапов, созданных здесь. Это позволит нам вызывать этапы по цепочке. Здесь есть один очень важный метод build, который заключается в том, чтобы получить результат или создать конечный объект Car. Этот метод фактически проверяет годность автомобиля и выпускает (возвращает) его только в том случае, если его сборка завершена успешно (все валидно).
 */
public interface CarBuilder {

    // Этап 1
    public CarBuilder fixChassis();

    // Этап 2
    public CarBuilder fixBody();

    // Этап 3
    public CarBuilder paint();

    // Этап 4

    public CarBuilder fixInterior();

    // Выпуск автомобиля

    public Car build();
}