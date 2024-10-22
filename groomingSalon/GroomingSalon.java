package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private List<Pet> data;
    private int capacity;

    public List<Pet> getData() {
        return data;
    }

    public void setData(List<Pet> data) {
        this.data = data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < getCapacity()) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        if (!data.isEmpty()) {
            data.removeIf(pet -> pet.getName().equals(name));
            return true;
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (data.contains(pet)) {
                if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                    return pet;
                }
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        String result = "";
        StringBuilder stringBuilderResult = new StringBuilder(result);
        if (!data.isEmpty()) {
            System.out.println(" The grooming salon has the following clients:");
            for (Pet pet : data) {
                String name = pet.getName();
                String owner = pet.getOwner();
                stringBuilderResult.append(name).append(" ").append(owner).append("\n");
            }
        }
        return stringBuilderResult.toString().trim();
    }

}



