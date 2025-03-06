# Вводная лабораторная 
### Требования 
Для выполнения лабораторной потребуется установить:
1) Java версии не ниже 17
2) IDE Eclipse или Idea не использовать (а взять любимый текстовый редактор)
3) Завести аккаунт на github
4) Maven 3+
5) Git

### Задание
Разработать программу для проверки строки на сбалансированность скобок

---

### Создание проекта
```
mvn archetype:generate -DgroupId=ru.spbstu.telematics.java -DartifactId=BracketBalance -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Заменить в pom.xml зависимость junit на
```
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.12</version>
  <scope>test</scope>
</dependency>
```

Добавить библиотеку commons-io или commons-math
```
<dependency>
  <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.5</version>
</dependency>
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-math3</artifactId>
  <version>3.6</version> 
</dependency>
```
--- 
### Сдача лабораторной работы
1) Предъявление работоспособного кода
2) Ссылка на gitHub с проектом
3) Unit тесты, проверяющие правильность работы программы
4) Демонстрация студентом умения базового использования Maven, Git и Java


