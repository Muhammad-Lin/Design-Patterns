package javaproxy;

/**
 * @name: PersonBean
 * @author: yoga
 * @create: 2022-09-21 16:42
 **/
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNoRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
