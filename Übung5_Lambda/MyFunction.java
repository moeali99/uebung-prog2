import java.util.function.Predicate;

@FunctionalInterface
public interface MyFunction {
    int apply(int i);
    
    default MyFunction conditionateInput(Predicate<Integer> predicate) {
        return i -> predicate.test(i) ? this.apply(i) : 0;
    }
    
    default MyFunction conditionateOutput(Predicate<Integer> predicate) {
        return i -> {
            int result = this.apply(i);
            return predicate.test(result) ? result : 0;
        };
    }
}
