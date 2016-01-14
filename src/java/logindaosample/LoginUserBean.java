package logindaosample;

import java.io.Serializable;

/**
 * ログインユーザ情報クラス.
 */
public class LoginUserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;			// ID
    private String name;		// 名前
    private int age;			// 年齢

    /**
     * コンストラクタ. メンバ変数の値を初期化.
     */
    public LoginUserBean() {
        this.id = "";
        this.name = "";
        this.age = -1;
    }

    /**
     * IDを返却.
     *
     * @return ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * IDを設定.
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 名前を返却します.
     *
     * @return 名前
     */
    public String getName() {
        return this.name;
    }

    /**
     * 名前を設定.
     *
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を返却.
     *
     * @return 
     */
    public int getAge() {
        return this.age;
    }

    /**
     * 年齢を設定.
     *
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
}
