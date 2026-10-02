public interface Locomotion {
    void trick();
    int forward(int distance);
    int backward(int distance);
    int left(int distance);
    int right(int distance);
    String totalMoved();
}
