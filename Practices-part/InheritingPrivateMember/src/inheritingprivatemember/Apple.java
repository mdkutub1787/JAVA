package inheritingprivatemember;

/**
 * @author MD KUTUB UDDIN
 */
public class Apple extends Android {

    private String appStore;

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    void displayInformation() {

        System.out.println(getMakeText());
        System.out.println(getCamera());
        System.out.println(getVideo());
        System.out.println(getPlayStore());
        System.out.println(getAppStore());

    }
}
