/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 09-02-2022
 *Time: 02:05 PM
 */

package main;

public class Module {
    private int[] birdsPerDay;

    public void BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public Module(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
        if(birdsPerDay.length==0)
            return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean response = false;
        for(int index =0; index<birdsPerDay.length;index++){
            if(birdsPerDay[index]==0){
                response = true;
                break;
            }
        }
        return response;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int response = 0;
        if(birdsPerDay.length==0)
            return 0;
        if(numberOfDays>birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        if(numberOfDays>birdsPerDay.length)
            for(int index=0;index<numberOfDays-1;index++){
                response = response + birdsPerDay[index];
            }
        return response;
    }

    public int getBusyDays() {
        int response =0;
        if(birdsPerDay.length==0)
            return 0;
        for(int i =0;i<birdsPerDay.length-1;i++){
            if(birdsPerDay[i] >=5){
                response++;
            }
        }
        return response;
    }
}

