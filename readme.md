# Map data structure

> *"A hashmap is a structure able to store key-value pairs. The value is any object your application needs to handle, and a key is something that can represent this object.*
>
> *Suppose you need to create an application that has to handle invoices, represented by instances of an Invoice class. Then your values are these Invoice instances, and your keys could be the invoice numbers. Each invoice has a number, and that number is unique among all your invoices."*
>
> Using Maps to Store Key Value Pairs. Oracle. https://dev.java/learn/api/collections-framework/maps/

With this assignment, you will learn to utilize the map data structure in your own applications. To support the exercises, we recommend the following materials:

- [Map and HashMap in Java (Coding with John, YouTube)](https://youtu.be/H62Jfv1DJlU)
- [Using Maps to Store Key Value Pairs (dev.java)](https://dev.java/learn/api/collections-framework/maps/)
- [Managing the Content of a Map (dev.java)](https://dev.java/learn/api/collections-framework/working-with-keys-and-values/)
- [Lesson examples](https://github.com/hh-programming-2/lessons?tab=readme-ov-file#lesson-2-map)

The assignment consists of several parts, each of which will be evaluated separately using pre-written tests.

## Starting the assignment

Once you have created your own repository from the assignment's template repository, clone your Git repository to your own computer using the `git clone` command. The assignment must be done in your own copy, so **make sure that your GitHub username is included in the repository address!**

```sh
git clone https://github.com/YOUR_GITHUB_USERNAME/programming-2-map.git
```

After cloning the project to your local machine, open it in your code editor.

## Submitting solutions

Once you have solved some or all of the exercises and committed your answers, submit the solutions for evaluation using the `git push` command. Git push will automatically trigger a GitHub Actions workflow that compiles and tests your solutions, providing a pass or fail result for each test.

Once the GitHub Actions has executed your code, you see the results in your GitHub repository's ["Actions" tab](../../actions/workflows/grading.yml). It usually takes a few minutes for the assesment to be completed. 

By clicking on the latest *"Grading"* execution from the link above, you will get detailed information about the task evaluation. The red cross symbol ❌ on the execution indicates that you don't have the full points yet, whereas the green checkmark ✅ indicates you have the full points. The "Grading summary" section contains your total points and a breakdown of points from each part.

> [!TIP] 
> You can submit your solution (by using the `git push` command) for evaluation as many times as needed until the task deadline. However, make sure that the latest submission yields the best points, as only the most recent points will be valid.


## Exercise 1: [MapBasics.java](./src/main/java/part01/MapBasics.java) *(basics, 40 %)*

In this exercise, we will practice creating a new `Map` object and performing the most common operations for adding, retrieving, modifying, and removing data.

The Java class to be coded in this exercise, [MapBasics](./src/main/java/part01/MapBasics.java), consists of predefined methods with Javadoc comments explaining how each method should function. **Your exercise is to read the comments and implement the method content to match the method name and description.**

You can test your code using your own `main` method, or you can utilize the provided JUnit unit tests for the exercise, which can be found in the [MapBasicsTest](./src/test/java/part01/MapBasicsTest.java) class. 
You can run the tests either using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or using the [Gradle tool](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests MapBasicsTest        # unix
.\gradlew.bat test --tests MapBasicsTest    # windows
```

> [!TIP]
> If the tests do not pass, try running the command again with the `--info` argument at the end. This will give you more detailed information about what went wrong in the test. Alternatively, you can run the tests using the testing tool in your code editor ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)), which typically displays errors clearly.

> [!NOTE]
> You do not need to familiarize yourself with the technical implementation of the actual test. At this stage, it is sufficient to run the tests and review any error messages they may produce.

> [!NOTE]
> Note that many methods in this class are not dependent on the type of Map data structure used. For example, the `countEntries` method could work equally well with `<String, String>` as with `<String, Integer>` types of keys and values. In a real program, you would likely use generic types, such as `Map<K, V>`. In this exercise, you do not need to specifically study generic types, but you can explore the topic independently and implement the methods generically if you wish. For more information, see the tutorial: https://dev.java/learn/generics/.

## Exercise 2: [MapExperts.java](./src/main/java/part02/MapExperts.java) *(applying, 30 %)*

In this exercise, we continue with exercises that apply `Map` operations. The exercises are more challenging in nature and require broader problem-solving skills beyond the use of individual methods.

As in the previous exercise, [MapExperts.java](./src/main/java/part02/MapExperts.java) also consists of predefined methods with Javadoc comments explaining how each method should function. **Your exercise is to read the comments and implement the method content to match the method name and description.**

As in the previous exercise, you can test your code using your own `main` method or the provided JUnit unit tests. The tests can be found in the [MapExpertsTest](./src/test/java/part02/MapExpertsTest.java) class. You can run the tests either using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or using the [Gradle tool](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests MapExpertsTest        # unix
.\gradlew.bat test --tests MapExpertsTest    # windows
```


## Exercise 3: [PostalCodesMain.java](./src/main/java/part03/PostalCodesMain.java) *(applying, 15 % + 15 %)*

Computer programs often use the JSON file format for handling structured data. [JSON (JavaScript Object Notation)](https://www.json.org/) is a lightweight and common way to store and transfer information between programs. JSON-formatted data can be used in many different applications, such as web servers, mobile applications, and working with databases. JSON-formatted data might look like this, for example:

```json
{
    "74701": "KIURUVESI",
    "35540": "JUUPAJOKI",
    "74705": "PAKETTIAUTOMAATTI",
    "74704": "SMARTPOST",
    "44884": "SMART POST"
}
```

In a Java program, the Map data structure is excellent for handling the key-value pairs shown above. In this exercise, we will focus on processing postal code data stored in a [JSON file named *postcode_map_light.json*](./data/postcode_map_light.json).

> [!NOTE]
> To read the JSON file in a Java program, we will use Google's GSON library in this exercise. [GSON](https://github.com/google/gson) allows converting JSON data to Java objects and vice versa. The handling of the JSON file has been pre-implemented in the [PostalCodesReader](./src/main/java/part03/PostalCodesReader.java) class. You do not need to delve into the details of GSON or use it yourself.

> [!NOTE]
> GSON is not part of the Java standard library; it has been added to this project using the Gradle tool. Examine the [`build.gradle`](./build.gradle) file to find out how and where GSON is specified.

### User interface

Unlike the previous exercises, in this exercise you are free to implement the solution in the way you see fit and create the classes and methods you deem necessary. However, your program must work in such a way that it starts from the `PostalCodesMain` class's main method and asks the user only one question. The result must also be printed in the format specified in the exercise description.

Therefore, implement the logic in the [PostalCodesMain](./src/main/java/part03/PostalCodesMain.java) class, which utilizes the `readPostalCodes` method from the [PostalCodesReader](./src/main/java/part03/PostalCodesReader.java) class. Depending on the situation, your program should print either the name of the post office corresponding to the postal code entered by the user or the postal codes corresponding to the name.

**Postal code (15 %)**

The user might enter a number, in which case the program will search for the corresponding post office name:

```
Input postal code or district (e.g., 00100 or Helsinki): 00100

Post office: HELSINKI

[ end of execution ]
```

In the example above, the user entered the input `00100` and the program printed the name `HELSINKI`. If the postal code is not found in the data, print the text "Postal code not found."

> [!NOTE]
> Note that due to automatic evaluation, the program should only ask for one input, print the response, and then terminate.

**Name of the post office (15 %)**

If the user enters the name of a post office, the program should print all postal codes that belong to that post office:

```
Input postal code or district (e.g., 00100 or Helsinki): Porvoo

Postal codes: 06100, 06101, 06150, 06151, 06200, 06400, 06401, 06450, 06500

[ end of execution ]
```

In this example, the user entered the text `Porvoo` and the program printed the postal codes for Porvoo. If no postal codes are found for the given name, print "Postal codes not found.". Your program should find the postal codes regardless of the case of the input name.

In the output, **the postal codes must be in ascending order, separated by commas**, so first collect the postal codes in a list, which you then [sort](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html#sort(java.util.List)) before printing.

### Running the program

You can run the [PostalCodesMain](./src/main/java/part03/PostalCodesMain.java) main program either using the Run button in your code editor's interface or with the Gradle tool from the command line:

```
./gradlew --quiet --console plain run         # unix
.\gradlew.bat --quiet --console plain run     # windows

# -q, --quiet         Log errors only.
# --console [plain]   Specifies which type of console output to generate.
#                     Values are 'plain', 'auto' (default), 'rich' or 'verbose'.
```

> [!NOTE]
> The first run might be very slow, but [subsequent runs will be faster thanks to Gradle's build cache](https://docs.gradle.org/current/userguide/build_cache.html). Alternatively, you can run your program using the "run" button in your code editor.*

> [!NOTE] 
> Gradle can execute the main method from the correct Java class using the run command because `PostalCodesMain` is specified as the main program in the [`build.gradle`](./build.gradle) file.

### Testing the exercise

These postal code tasks are tested through the user interface, so unlike previous tasks, there are no pre-written unit tests for them. Therefore, you need to test the functionality of your solution yourself by running the program's `main` method and checking its output. The provided [PostalCodesReaderTest](./src/test/java/part03/PostalCodesReaderTest.java) class only verifies that the [pre-written code for reading postal codes from files](./src/main/java/part03/PostalCodesReader.java) works correctly, but it does not test the main program you implemented.

## Bonus exercise 4: [MorseCode.java](./src/main/java/part04/MorseCode.java) *(applying, 0 %)*

MorseCode-luokkaan on toteutettava kaksi metodia: `morseToText` ja `textToMorse`. Nämä metodit muuntavat merkkijonoja morsekoodista "normaaliksi" tekstiksi ja päinvastoin:

This is a bonus task that is not included in the task evaluation. You can choose to implement the [MorseCode-luokan](./src/main/java/part04/MorseCode.java) class and the related [MorseApp](./src/main/java/part04/MorseApp.java) class, or you can skip this task.

The MorseCode class should implement two methods: `morseToText` and `textToMorse`. These methods convert strings from Morse code to "normal" text and vice versa:

```
hello world
.... . .-.. .-.. ---   .-- --- .-. .-.. -..
```

Lisätietoja morsekoodista löytyy esimerkiksi Wikipediasta: [https://en.wikipedia.org/wiki/Morse_code](https://en.wikipedia.org/wiki/Morse_code).

MorseCode-luokalle on valmiit testit, jotka löytyvät [MorseCodeTest](./src/test/java/part04/MorseCodeTest.java)-luokasta. Voit suorittaa testit koodieditorisi testaustyökalulla ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) tai [Gradle-automaatiotyökalulla](https://docs.gradle.org/current/userguide/java_testing.html):

More information about Morse code can be found, for example, on Wikipedia: <https://en.wikipedia.org/wiki/Morse_code>.

There are ready-made tests for the MorseCode class, which can be found in the [MorseCodeTest](./src/test/java/part04/MorseCodeTest.java) class. You can run the tests either using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or using the [Gradle tool](https://docs.gradle.org/current/userguide/java_testing.html):


```
./gradlew test --tests MorseCodeTest        # unix
.\gradlew.bat test --tests MorseCodeTest    # windows
```

---------

## Copyrights of the postal code data

The postal code data used in this project [postcode_map_light.json](./data/postcode_map_light.json) is borrowed from the <https://github.com/theikkila/postinumerot> project's [postcode_map_light.json](https://github.com/theikkila/postinumerot/blob/master/postcode_map_light.json) file dated 7.6.2023.

The copyright of the data belongs to Posti and it is used in accordance with [Posti's terms of use](https://www.posti.fi/fi/asiakastuki/postinumerotiedostot). If you make copies of this material, ensure compliance with [the terms of use](https://www.posti.fi/fi/asiakastuki/postinumerotiedostot).

## Programming MOOC

The methods in the `MapExperts` class are heavily influenced by the Python exercises from the University of Helsinki's Programming Basics MOOC course at https://ohjelmointi-23.mooc.fi/osa-5. The Programming MOOC is licensed under the CC BY-NC-SA 4.0 license.

## License and authors

This exercise is made by Teemu Havulinna and translated to English by Kalle Ilves and it is licensed under a [Creative Commons BY-NC-SA license](https://creativecommons.org/licenses/by-nc-sa/4.0/).

ChatGPT 3.5 language model and GitHub copilot AI assistant has been used to implement the exercise.
