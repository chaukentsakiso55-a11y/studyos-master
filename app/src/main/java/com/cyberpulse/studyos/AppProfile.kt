package com.cyberpulse.studyos

val appSpec = AppSpec(
    name = "StudyOS",
    shortName = "SO",
    tagline = "Learn. Build. Focus. Evolve.",
    hero = "One private study operating system for knowledge, focus, planning and creation.",
    primary = 0xFF4DE4FF,
    secondary = 0xFFFFC857,
    focusLabel = "Deep-work session",
    logHint = "Capture a note, command or learning objective",
    features = listOf(
        AppFeature("Tutor", "Break a difficult topic into a clear learning path.", "LEARN"),
        AppFeature("Notes", "Capture and organize knowledge locally.", "WRITE"),
        AppFeature("Mind Map", "Turn connected ideas into a structured outline.", "MAP"),
        AppFeature("Focus", "Run intentional study blocks with a visible timer.", "DEEP"),
        AppFeature("Vault", "Prepare private storage for important school material.", "SAFE"),
        AppFeature("Terminal", "Shape developer tasks and technical experiments.", "DEV")
    ),
    metrics = listOf(
        AppMetric("Knowledge", "Local"),
        AppMetric("Focus", "Ready"),
        AppMetric("AI Tutor", "Phase 2"),
        AppMetric("Device mesh", "Future")
    ),
    about = "StudyOS is the Cyber Pulse student workspace: an offline-first foundation that joins study tools and developer thinking in one Android experience."
)
