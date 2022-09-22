package javaproxy;

/**
 * @name: PersonBeanImpl
 * @author: yoga
 * @create: 2022-09-21 16:45
 **/
public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNoRating() {
        if (ratingCount == 0)
            return 0;
        return (rating/ratingCount);
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
