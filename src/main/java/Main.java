import Builder.BuilderPet;
import Builder.BuilderUser;
import Requests.PetUtil;
import Requests.StoreUtil;
import Requests.UserUtil;
import Object.User;
import Object.Pet;
import Object.Status;
import Object.StoreOrder;
import Object.StatusStoreOrder;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        ApiConstants apiConstants = new ApiConstants();
        UserUtil userUtil = new UserUtil();
        User user = BuilderUser.newBuilder()
                .setPeople(2L,"Illya","Maznichenko")
                .setContacts("maznichenkoo16@gmail.com","+380636593406")
                .setLog("asnils","qwerty",2)
                .reset();
        User user1 = BuilderUser.newBuilder()
                .setPeople(3L,"Egor","Bondyk")
                .setContacts("e@gmail.com","+380123456789")
                .setLog("savitar","ytrewq",1)
                .reset();
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        PetUtil petUtil = new PetUtil();
        Pet pet = BuilderPet.newBuilder()
                .setPet(1L,"Barsyk",Status.AVAILABLE)
                .setTag(1L,"Cat")
                .setCategory(1L,"Animal")
                .setPhoto("url")
                .reset();

        StoreOrder storeOrder = createStoreOrder(1L,1L, LocalDateTime.now(),StatusStoreOrder.APPROVED,1,true);
        StoreUtil storeUtil = new StoreUtil();
        File file = new File("image.jpg");
//            userUtil.createUser(URI.create(apiConstants.URI_CREATE_USER_OR_DELETE),user);
//            userUtil.deleteUser(apiConstants.URI_CREATE_USER_OR_DELETE,user);
//            userUtil.loginUser(apiConstants.LOGIN_USER,user);
//            userUtil.logoutUser(URI.create(apiConstants.LOGOUT_USER));
//            userUtil.updateUser(apiConstants.UPDATE_USER,user);
//            System.out.println(userUtil.getUser(apiConstants.GET_USER, user));
//            userUtil.createListUser(list,URI.create(apiConstants.CREATE_USER_WITH_LIST));
//            petUtil.addPetToStore(URI.create(apiConstants.CREATE_PET_OR_UPDATE),pet);
//            petUtil.updatePet(URI.create(apiConstants.CREATE_PET_OR_UPDATE),pet);
//            System.out.println(petUtil.getByStatus(apiConstants.GET_BY_STATUS, String.valueOf(Status.AVAILABLE)));
//            System.out.println(petUtil.getById(apiConstants.GET_PET_BY_ID, 1L));
//            petUtil.updatePetById(apiConstants.UPDATE_PET_BY_ID,pet);
//            petUtil.deletePet(apiConstants.DELETE_PET,1L);
//            petUtil.uploadToImage(apiConstants.UPLOAD_IMAGE_PET,1L, file);
//            storeUtil.placeAnOrderForPet(URI.create(apiConstants.PLACE_ORDER),storeOrder);
//            System.out.println(storeUtil.getPurchaseById(apiConstants.GET_PURCHASE_BY_ID, 1));
//            System.out.println(storeUtil.getStoreInventory(URI.create(apiConstants.GET_STORE_INVENTORY)));
//            storeUtil.deletePurchaseOrderById(apiConstants.DELETE_PURCHASE_ORDER_BY_ID,1);



    }


    private static StoreOrder createStoreOrder(Long id, Long petID, LocalDateTime shipDate, StatusStoreOrder statusStoreOrder,Integer quantity, Boolean copmlete){
        StoreOrder storeOrder = new StoreOrder();
        storeOrder.setId(id);
        storeOrder.setPetId(petID);
        storeOrder.setShipDate(String.valueOf(shipDate));
        storeOrder.setStatus(statusStoreOrder);
        storeOrder.setQuantity(quantity);
        storeOrder.setComplete(copmlete);
        return storeOrder;
    }
}
