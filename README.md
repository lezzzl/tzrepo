## Техническое задание 2 
![Java CI with Maven](https://github.com/lezzzl/tzrepo/actions/workflows/main.yml/badge.svg?event=push)

Все зависимости, требуемые для Maven, хранятся в файле [pom.xml](pom.xml)
### Описание проекта: 
### Часть №1
В файле [multifunc.java](src/main/java/org/example/multifunc.java) (path: *src/main/java/org/example/multifunc.java*) реализованы на Java функции, которые считывают из файла числа, а далее отдельными функциями ищут среди этих чисел минимальное число, максимальное число, считают их общую сумму и произведение.
Функции называются, соответственно readFromFile, _min, _max, _sum, _mult.
#### Пример работы:
input_file: [test1](test1.txt)  
```bash 
10 2 4 1 5
```
![image](https://github.com/lezzzl/tzrepo/blob/main/Example_1.jpg)
#### Тесты для проверки корректности функций поиска минимума, максимума, сложения и умножения:
В файлах [test1](test1.txt), [test2](test2.txt), [test3](test3.txt), [test4](test4.txt), [test5](test5.txt) хранятся тесты для запуска файла [functest.java](src/test/java/org/example/functest.java) (path: *src/test/java/org/example/functest.java*), в котором реализованы UNIT-тесты для проерки корректности работы функций

![image](https://github.com/lezzzl/tzrepo/blob/main/Example_2.jpg)

#### Тесты для проверки скорости работы программы при увеличении размера входного файла
В файлах speedtest(1-10) хранятся числа для тестирования скорости работы программы при увеличении размера входного файла
В файле [speedsestBENCH.java](src/main/java/org/example/speedtestBENCH.java) (path: *src/main/java/org/example/speedtestBENCH.java*) реализована программа, которая измеряет время работы тестов с помощью бенчмарка 

В файле [testGraphBENCH.java](src/main/java/org/example/testGraphBENCH.java) (path: *src/main/java/org/example/testGraphBENCH.java*) реализована программа, которая собирала данные для построения графика зависимости для функции  *_min*

![image](https://github.com/lezzzl/tzrepo/blob/main/Bench_score.jpg)

Далее по этим данным был построен график зависимости

![image](https://github.com/lezzzl/tzrepo/blob/main/Graph.jpg)

#### Реализация теста на мой выбор
В файл с тестами *functest.java* был добавлен сценарный тест *myTest*, в котором тестируется сценарий поиска минимума из максимуов всех чисел пяти тестов

### Часть №2
Настроена CI система *GitHub Actions* таким образом, чтобы прогон тестов запускался автоматически при любом новом push-e в репозиторий моего проекта

