package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-6-19
 * Time:上午9:56
 * Vision:1.1
 * Description:创建一个Hashset<animal>,如果animal的名字相同就是同一个对象
 */
public class overwriteBean {
    static  class anaimal{
        private int age;
        private String name;
        public anaimal(int age,String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            anaimal anaimal = (anaimal) o;
            return age == anaimal.age &&
                    Objects.equals(name, anaimal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return "anaimal{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void solution(HashSet<anaimal> x){
        Iterator<anaimal> iterator = x.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next().toString());
       }
    }

    public static void main(String[] args) {
        HashSet<anaimal> anaimals = new HashSet<>();
        anaimals.add(new anaimal(1,"a"));
        anaimals.add(new anaimal(2,"b"));
        anaimals.add(new anaimal(2,"c"));
        anaimals.add(new anaimal(2,"c"));
        solution(anaimals);
    }




}
