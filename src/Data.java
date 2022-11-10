import java.util.ArrayList;

public class Data {
    static ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();
        // 1. First
        questions.add(
                new Question(
                        "Who invented Java Programming?",
                        "James Gosling",
                        new String[]{
                                "Guido van Rossum",
                                "James Gosling",
                                "Dennis Ritchie",
                                "Bjarne Stroustrup"
                        }
                ));

        // 2. Second
        questions.add(
                new Question(
                        "Which statement is true about Java?",
                        " Java is a platform-independent programming language",
                        new String[]{
                                "Java is a sequence-dependent programming language",
                                "Java is a code dependent programming language",
                                "Java is a platform-dependent programming language",
                                "Java is a platform-independent programming language"
                        }
                ));

        // 3. Third
        questions.add(
                new Question(
                        "Which component is used to compile, debug and execute the java programs?",
                        "JDK",
                        new String[]{
                                "JRE",
                                "JIT",
                                "JDK",
                                "JVM"
                        }
                ));

        // 4. Forth
        questions.add(
                new Question(
                        "Which one of the following is not a Java feature?",
                        "Use of pointers",
                        new String[]{
                                "Object-oriented",
                                "Use of pointers",
                                "Portable",
                                "Dynamic and Extensible"
                        }
                ));

        // 5. Fifth
        questions.add(
                new Question(
                        """
                                What will be the output of the following Java program?class output {
                                        public static void main(String args[])\s
                                        {
                                            double a, b,c;
                                            a = 3.0/0;
                                            b = 0/4.0;
                                            c=0/0.0;
                                \s
                                \t    System.out.println(a);
                                            System.out.println(b);
                                            System.out.println(c);
                                        }\s
                                    }""",
                        "all of the mentioned",
                        new String[]{
                                "NaN",
                                "Infinity",
                                "0.0",
                                "all of the mentioned"
                        }
                ));

        // 6. Sixth
        questions.add(
                new Question(
                        " Which of these cannot be used for a variable name in Java?",
                        "keyword",
                        new String[]{
                                "identifier & keyword",
                                "identifier",
                                "keyword",
                                "none of the mentioned"
                        }
                ));

        // 7. Seventh
        questions.add(
                new Question(
                        " What is the extension of java code files?",
                        ".java",
                        new String[]{
                                ".js",
                                ".txt",
                                ".class",
                                ".java"
                        }
                ));

        // 8. Eighth
        questions.add(
                new Question(
                        """
                                What will be the output of the following Java code?
                                    class increment {
                                        public static void main(String args[])\s
                                        {       \s
                                             int g = 3;
                                             System.out.print(++g * 8);
                                        }\s
                                    }""",
                        "32",
                        new String[]{
                                "32",
                                "33",
                                "24",
                                "25"
                        }
                ));

        // 9. Ninth
        questions.add(
                new Question(
                        "Which environment variable is used to set the java path?",
                        "JAVA_HOME",
                        new String[]{
                                "MAVEN_Path",
                                "JavaPATH",
                                "JAVA",
                                "JAVA_HOME"
                        }
                ));

        // 10. Tenth
        questions.add(
                new Question(
                        "Which of the following is not an OOPS concept in Java?",
                        "Compilation",
                        new String[]{
                                "Polymorphism",
                                "Inheritance",
                                "Compilation",
                                "Encapsulation"
                        }
                ));

        return questions;
    }

}
