package labpack.Lab7;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {

        @Override
        public int compare(BookDTO o1, BookDTO o2) {

            int result = 0;

            if(o1.getCategory() - o2.getCategory() > 0){
                result = 1;
            } else if(o1.getCategory() - o2.getCategory() < 0) {
                result = -1;
            }
            return result;
        }

    }

