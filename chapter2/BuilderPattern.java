package chapter2;


/**
 * Effective java 항목 2 <br>
 * 빌더패턴은 매개변수가 많은 객체를 생성할 때 유효한 생성 패턴이다. <br>
 * 자바 빈즈 패턴보다 안정성이 더 높다. <br>
 * 결론적으로 static 팩토리 메소드나 생성자에서 많은 매개변수를 갖게될 클래스를 설계할 때는 빌더 패턴이 좋다.
 */
public class BuilderPattern {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private static class Builder {
        //필수 매개변수들
        private final int servingSize;
        private final int servings;

        //선택 매개 변수들은 default값으로 초기화
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    //유효성 검증이 존재한다면, BuilderPattern 생성자에서 유효성 검증을 해야한다.
    public BuilderPattern(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }
}
