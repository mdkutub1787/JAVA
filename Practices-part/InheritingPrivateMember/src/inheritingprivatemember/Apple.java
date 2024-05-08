
package inheritingprivatemember;

/**
 * @author MD KUTUB UDDIN
 */
public class Apple extends Android{
    private String appStore;

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }
}
