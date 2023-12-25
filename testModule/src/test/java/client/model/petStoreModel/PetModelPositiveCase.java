package client.model.petStoreModel;

import org.openapitools.client.model.petStoreModel.Pet;
import org.openapitools.client.model.petStoreModel.Tag;

import java.util.Arrays;

public enum PetModelPositiveCase {
    PET_MODEL_CASE_1("Pet Model DataSet 1", 200),
    PET_MODEL_CASE_2("Pet Model DataSet 2", 200);

    private final String value;
    private final Integer statusCode;

    //cases handling
    public Pet getPet() {
        Pet pet = new Pet();
        switch (this) {
            case PET_MODEL_CASE_1:
                pet.setId(1L);
                pet.setName("doggie");
                pet.setPhotoUrls(Arrays.asList("https://petstore.swagger.io/v2/pet/1/photo"));
                pet.setTags(Arrays.asList(new Tag().id(1L).name("tag1")));
                pet.setStatus(Pet.StatusEnum.AVAILABLE);
                return pet;
            case PET_MODEL_CASE_2:
                pet.setId(2L);
                pet.setName("doggie2");
                pet.setPhotoUrls(Arrays.asList("https://petstore.swagger.io/v2/pet/2/photo"));
                pet.setTags(Arrays.asList(new Tag().id(2L).name("tag2")));
                pet.setStatus(Pet.StatusEnum.PENDING);
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
