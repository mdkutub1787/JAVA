package threaddemo;

public  class PrintNum implements Runnable{

    private int lastNum;

    public PrintNum() {
    }

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    public int getLastNum() {
        return lastNum;
    }

    public void setLastNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }

    }
    
}
