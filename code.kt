fun main() {
    val floors = 1..10
    val people = readLine()?.toIntOrNull() ?: 0

    // 3. Create an empty list for passenger floors
    val passengersFloors = mutableListOf<List<Int>>()

    // 4. Input floors for each passenger
    for (i in 1..people) {
        print("Enter floors for passenger $i separated by space: ")
        val passengerFloors = readLine()?.split(" ")?.map { it.toIntOrNull() } ?: emptyList()
        passengersFloors.add(passengerFloors.filterNotNull())
    }

    // 5. Output each floor
    for (floor in floors) {
        println("Floor: $floor")

        // 6. Output stops
        for (passenger in passengersFloors) {
            if (floor in passenger) {
                println("Stop on floor $floor for a passenger")
            }
        }
    }
}
