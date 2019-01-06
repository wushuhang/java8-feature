package effectivejava.chapter8.item55;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Max {

	public static <E extends Comparable<E>>
    Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) throws Exception{
    	args = new String[] {"hangzhou","zhoushan","ningbo"};
        List<String> words = Arrays.asList(args);

        System.out.println(max(words));

        // Using an optional to provide a chosen default value (Page 251)
        String lastWordInLexicon = max(words).orElse("No words...");
        System.out.println(lastWordInLexicon);
        
        Optional<String> temp = Optional.empty();
        System.out.println(temp.isPresent());
        String value = temp.orElse("blank");
        System.out.println(value);
        
        String haha =  temp.map(each -> each).orElse("NONO");
        System.out.println(haha);
        
        System.out.println("\n============STREAM API Example=================");
        
        Arrays.stream(Object.class.getMethods())
        .map(method -> method.getName())
        .filter(each -> each.contains("a"))
        .distinct()
        .forEach(System.out::println);
        
        IntStream.iterate(1, i -> i + 10).limit(3)
        .forEach(System.out::println);
        
//        Files.lines(Paths.get("C://Users//shuha//git//github//java8-feature//src//main//java//effectivejava//chapter8//item55//Max.java"))
//        .forEach(Max::display);
        
        
        
    }
    
    private static void display(String each) {
    	System.out.println(">>>>>\t" + each);
    }
}
