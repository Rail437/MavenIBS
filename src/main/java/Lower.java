import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Lower {
    public static void main(String[] args) {

        if(args.length != 0){
            Arrays.stream(args).map(StringUtils::lowerCase).forEach(System.out::println);
        }
    }

}
