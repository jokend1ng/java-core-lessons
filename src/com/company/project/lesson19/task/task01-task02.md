## Задание 1 (на методы Stream)
1. в чём разница между методами `peek` и `map`?
2. в чём разница между методами `peek` и `foreach`?
3. в чём разница между методами `map` и `flatMap`?
4. в чём разница между методами `map` и `mapToInt`?

## Задание 2 
Дан список транспортных средств


        List<Vehicle> vehicles = List.of(
            new Car(Repaintable.Color.GOLD, "001"),
            new Train("002", 10, true),
            new MiniCar(Repaintable.Color.ORANGE, "003"),
            new Bus("004"),
            new Train("005", 15, false),
            new Car(Repaintable.Color.BLACK, "006"),
            new MiniCar(Repaintable.Color.ORANGE, "007")
        );

### Задание 2.1
1. отсортировать по уровню износа от большего к меньшему `.sorted(Comparator comparator)`
2. получить список номеров транспортных средств `.toList()`

### Задание 2.2
1. получить суммарный уровень износа транспортных средств `.mapToInt(ToIntFunction function)` и `.sum()`

### Задание 2.3
1. сменить цвет каждой машины на GOLD `.peek(Consumer consumer)`
2. вывести каждый элемент в консоль `.foreach(Consumer consumer)`