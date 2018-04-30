package dungeon;

import lombok.Getter;

@Getter
public enum RoomDescription {
    RS("Starting room", "The room where our heroes started their quest."),
    R0("Shadowy room", "There are 4 skeletons laying in the corners of the room.\n" +
            " One has arrows sticking out of his hands, which he used to cover his eyes.\n" +
            " Same goes for second one, who attempted to cover his ears.\n" +
            " Third one has suffered same fate, eternaly covering his mouth." +
            " But fourth is a whole different story.\n" +
            " Twisted his body lays with arrow sticking out from his knee.\n" +
            " It's the bloody arrow in the knee joke all over again... God dammit..."),
    R1("Empty room", "This room seems empty at first glance,\n" +
            " but after a closer look you notice an engineer's wrench on the floor.\n" +
            " You can't help but wonder what cruel fate was bestowed upon it's owner.\n" +
            " Perhaps he sold it for a bottle of beer."),
    R2("Wet room", "Even before entering the room, you could hear the sound of flowing water,\n" +
            " perhaps it is a water spring. Upon entering the room you realised that the source of\n" +
            " sound was in fact something far worse than water. It was broken sewage pipe."),
    R3("Number 3 room", "This room had a number 3 over it's door, you wonder what this means\n" +
            " Upon inspecting the room, you realise that it's just an ordinary empty room.\n" +
            " It was just at third room."),
    R4("Dark room", "You noticed a glimmering light coming out of this room.\n" +
            " Upon entering you found a party of guards dressed in occultist robes.\n" +
            " They quickly flee the scene. You have an ominous feeling."),
    R5("Rich room", "You are impressed with the mere sight of this room,\n" +
            " it's walls are made of gold with various precious stones gemmed inside it.\n" +
            " Unfortunately you are unable to chip off any of the gems and thus decided to move on."),
    R6("Empty room", "Absolutely empty room, there's nothing in it except for the sound of draft wind."),
    R7("Comfortable room", "This is a room filled entirely with comfortable looking sofas and chairs.\n" +
            " You decide to rest in it for some time."),
    R8("Noisy room", "As it turned out, the noise was music. And entire room is outfitted as a pub.\n" +
            " Indeed confused you are, why would anybody want to create a pub inside a dungeon?\n" +
            " It's a terrible business choice."),
    R9("Creepy room", "In the room you find a group of skeletons, dancing on the pile of bones.\n" +
            " What horrific dark forces roam in here?"),
    R10("Peaceful room", "T'is just a library, no wonder it looked peaceful. Libraries are no threat at all.\n" +
            " Perhaps you can find a map to this dungeon here? Or maybe some forbidden knowledge?"),
    R11("Judgement room", "This room looks like a judge court, with panels for judges, witnesses and plaintiffs.\n" +
            " Was the verdict to imprison you appointed in this room?"),
    RE("Exit room", "Is it finally it? The end of your unbelievably unfortunate journey?\n" +
            " It is indeed the exit!");

    private String name;
    private String description;

    RoomDescription(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
