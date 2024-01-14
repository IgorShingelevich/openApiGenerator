package client.model.petStoreModel;

import base.EnumNotSupportedException;
import org.openapitools.client.model.petStoreModel.Pet;
import org.openapitools.client.model.petStoreModel.Tag;

import java.util.Arrays;

public enum PetModelPositiveCase {
    CREATE_PET_1("Pet Model DataSet 1", 200),
    CREATE_PET_2("Pet Model DataSet 2", 200),
    CREATE_PET_3("Pet Model DataSet 3", 200),
    CREATE_PET_4("Pet Model DataSet 4", 200);

    private final String value;
    private final Integer statusCode;

    //cases handling
    public Pet getPet() {
        Pet pet = new Pet();
        switch (this) {
            case CREATE_PET_1:
                pet.setId(1L);
                pet.setName("doggie");
                pet.setPhotoUrls(Arrays.asList("https://petstore.swagger.io/v2/pet/1/photo"));
                pet.setTags(Arrays.asList(new Tag().id(1L).name("tag1")));
                pet.setStatus(Pet.StatusEnum.AVAILABLE);
                return pet;
            case CREATE_PET_2:
                pet.setId(2L);
                pet.setName("doggie2");
                pet.setPhotoUrls(Arrays.asList("https://petstore.swagger.io/v2/pet/2/photo"));
                pet.setTags(Arrays.asList(new Tag().id(2L).name("tag2")));
                pet.setStatus(Pet.StatusEnum.PENDING);
                return pet;
            case CREATE_PET_3:
                pet.setId(3L);
                pet.setName("doggie3");
                pet.setPhotoUrls(Arrays.asList("https://petstore.swagger.io/v2/pet/3/photo"));
                pet.setTags(Arrays.asList(new Tag().id(3L).name("tag3")));
                pet.setStatus(Pet.StatusEnum.SOLD);
                return pet;
            case CREATE_PET_4:
                pet.setId(4L);
                pet.setName("doggie4");
                pet.setPhotoUrls(Arrays.asList("https://petstore.swagger.io/v2/pet/4/photo"));
                pet.setTags(Arrays.asList(new Tag().id(4L).name("tag4")));
                pet.setStatus(Pet.StatusEnum.AVAILABLE);
                return pet;
            default:
                throw new EnumNotSupportedException(this);
        }
    }

    // get response status code
    public Integer getStatusCode() {
        return statusCode;
    }

    PetModelPositiveCase(String value, Integer statusCode) {
        this.value = value;
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
