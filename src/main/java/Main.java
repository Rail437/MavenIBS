import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        if(args.length != 0){
            Arrays.stream(args).map(StringUtils::upperCase).forEach(System.out::println);
        }
    }
}
