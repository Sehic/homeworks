package com.example.zadaca.smorzadaca;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * Created by Sehic on 25.10.2015.
 */
public class PersonList implements Parcelable{

    private static PersonList persons;
    private List<PersonModel> personList;
    private int mData;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public List<PersonModel> getPersons() {
        return personList;
    }

    public void addPerson(Editable name, Editable surname) {
        personList.add(new PersonModel(name.toString(), surname.toString()));
    }

    public PersonModel getPerson(int index) {
        return personList.get(index);
    }

    public int getSize() {
        return personList.size();
    }

    public void removePerson(UUID id) {
        Iterator<PersonModel> it = personList.iterator();
        while (it.hasNext()) {
            if (it.next().getID().equals(id)) {
                it.remove();
                return;
            }
        }
    }

    public void addPerson(PersonModel person) {
        personList.add(person);
    }

    public void removePerson(PersonModel person) {
        personList.remove(person);
    }

    public static PersonList get() {
        if (persons == null) {
            persons = new PersonList();
        }
        return persons;
    }

    public int findPosition(PersonModel person) {
        for (int i = 0; i < personList.size(); i++) {
            if (person.getID().equals(personList.get(i).getID())) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mData);
    }

    public static final Parcelable.Creator<PersonList> CREATOR = new Parcelable.Creator<PersonList>() {

        public PersonList createFromParcel(Parcel in) {
            return new PersonList(in);
        }

        public PersonList[] newArray(int size) {
            return new PersonList[size];
        }
    };

    private PersonList(Parcel in) {
        mData = in.readInt();
    }

}
