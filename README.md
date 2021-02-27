<img src="Stage 0 images/Growing logo.png" width="350" height="100">

## PHASE 0

### Team Members
 
 |    Name and Surname      |             Email              |  Git account  |
 |--------------------------|--------------------------------|---------------|
 | Jorge Adame Prudencio    | j.adame.2018@alumnos.urjc.es   |    jorge-ap   |
 | Antonio Agudo Esperanza  | a.agudo.2018@alumnos.urjc.es   |    agudroid   |
 | Marcos Robles Rodríguez  | m.roblesr.2018@alumnos.urjc.es |    mrcsrobles |
 | Flavia Vásquez Gutiérrez | f.vasquez.2018@alumnos.urjc.es |    flavia29   |
 
### Team Coordination Tools
*Trello:* [DAW Equipo 3](https://trello.com/b/97ygOHja/daw-equipo3)
___
Welcome to ***Growing***! In this application you can improve yourself by making good activities for your mental and physical health.

## Entities

  * **Users:** Users are the main entity of the application. They will be characterized by the following data:
    - User name.
    - Email. **(Primary key)**
    - Password.
    - Profile photo.
    - Plans completed with *like*.
    
 Users will have one or more favorite categories, which will be reflected in an N:M relationship, since a user can have several favorite categories and a category can be the favorite of more than one user.
 
  * **Tree:** Each user will have a tree for each *Category* whose mission will be to make them grow. The data for each tree are:

    - User.
    - Category.
    - Photo.
    - Height.
    - Last Update
    
     **(Primary Key)**: User and Category.
    
  * **Category:** This entity has the organise funtion, separating all the web plans by topic, allowing users to distinguish them:
    
    - Name. **(Primary Key)**
    - Photo.
    - Description.
    
As a result from the fact that an instance of the Plan entity can be associated at most with only one Category, but a Category can be related to many Plan instances, it will appear as *foreign key* in the Plan's table.
    
  * **Plan:** In order for users to grow the categories's tree, they will have to perform a series of activities that will be appearing when the *Administrator user* create them. The plans will have associated:
    - Name.
    - Photo.
    - Description.
    - Difficulty.
    - Category.

Because of users can have some favorite plans expressed with *like*, the relationship between this entities will be reflected in an N:M relationship, since a User can have several favorite plans and a Plan can be the favorite of more than one user.

## Users permission

The application has three types of users, which are:

  * **Anonymous user:** Users who are not registered will only be able to view the available categories and the plans they contain.
  
  * **Registered user:** The registered user, like the *anonymous user*, are able to view the categories and the plans that contains them. In addition, they can edit their profile data except email, which will be unchangeable once the user register it; mark a plan as completed, view their profile information both on the web and in PDF format if they want to, choose favorite category(ies) and observe the progress for each category, represented in multiple charts which will be explained in the section ***Charts***. Finally, they will receive an email when a tree in a category achieve a specific height.
  
  * **Administrator user:** This user is allowed, in addition to the functionalities described for the previous type of user, to control the record of plans made by users marking them as incompleted, and adding / editing categories and plans .
  
## Images 
The web application will contain one or more images for each entity to increase user satisfaction and making UI more intuitive. These are defined to:

  * **User:** The user will have a profile photo / avatar that can be customized by selecting a file from their own device.
  
  * **Tree:** The application will show registered users a photo of the status of their tree, which will change its appearance.
  
  * **Plan:** Each plan will have an icon / image that illustrates the category to which it belongs, another to show the difficulty of completing it, and finally an illustrative photo.
  
  * **Category:** Each category is defined by an icon / image that can be chosen only by the *Administrator users* in order to graphically show the user the purpose of each one.
  
## Charts
The application will have four charts. These will only be visible to *Registered users* and *Administrator users*.

  
  - The first will show the number of *likes* for each category. This information will be displayed in a *Doughnut chart*.
  
    <img src="Stage 0 images/Doughnut Chart.png" width="300" height="230">
  
  - The second will illustrate through a *Bar chart* the height of the tree in relation to its category.
  
    <img src="Stage 0 images/Bar Chart.png" width="700" height="500">
    
  - The third one will show the number of completed tasks per category for each user, revealed through a *Radar chart*.
  
    <img src="Stage 0 images/Radar Chart.png" width="350" height="300">
    
  - The fourth chart will show the activity during the current year through a calendar view where it will be indicated by a color code based on gradients if the user has been active. **(Optional)**
  
   <img src="Stage 0 images/Calendar Chart.png" width="650" height="300">

    
 ## Complementary Technologies
Complementary technologies to be used are:

  * **Sending emails to users:** Registered users will receive an email when they register in the application to confirm said email and also they will receive an email when a tree in a category achieve a specific height. 
  
  * **PDFs Generation:** The user may require the system to view and save all their profile information and progress in the application in PDF format. **(Optional)**
 
 ## Algorithm or advanced query
  - An algorithm will be used to calculate the height of the tree, which it increases in relation to the plan's completion. Their new height will be defined by calculating its increase proportionally to the difficulty of the task and decreasing when the plans are uncompleted.
  
  - An algorithm will be used to recommend plans to the user based on their data such as their *likes* and their favorite category. 

## PHASE 1

## Screenshots
### Principal page
 <img src="Stage 1 images/index.png" width="700">

### Categories 
 <img src="Stage 1 images/categories.png" width="700">
 
 #### Mental health
 <img src="Stage 1 images/mentalHealth.png" width="700">
 
### Explore
 <img src="Stage 1 images/explore.png" width="700">
 
### About us
 <img src="Stage 1 images/AboutUs.png" width="700">
 
### GetStarted
 <img src="Stage 1 images/loginRegisterSignIn.png" width="700">
 <img src="Stage 1 images/loginRegisterSignUp.png" width="700">

### Profile
<img src="Stage 1 images/profile.png" width="700">  

#### Edit profile
<img src="Stage 1 images/editProfile.png" width="700">

### Administrator profile
<img src="Stage 1 images/adminProfile.png" width="700">

## Navigation diagram
<img src="Stage 1 images/navigationDiagram.png">
