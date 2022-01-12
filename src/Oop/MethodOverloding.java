package Oop;

class MethodOverloding {
    public int add() {
        return 0;
    }

    public int add(int x, int y) {
        int resutl = x + y;
        return resutl;
    }

    public int add(int x, int y, int z) {
        int resutl = x + y + z;
        return resutl;
    }

    public float average(int x, int y) {
        float result = ((x + y) / 2.0f);
        return result;
    }

    public float average(int x, int y, int z) {
        float result = ((x + y + z) / 3.0f);
        return result;
    }
}