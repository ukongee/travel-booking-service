<template>
    <v-card outlined>
        <v-card-title>
            RequestTouristAttractions
        </v-card-title>

        <v-card-text>
            <String label="Preferences" v-model="value.preferences" :editMode="editMode"/>
            <Date label="TravelDate" v-model="value.travelDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="requestTouristAttractions"
            >
                RequestTouristAttractions
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RequestTouristAttractionsCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.preferences = '';
            this.value.travelDate = '2025-01-09';
        },
        watch: {
        },
        methods: {
            requestTouristAttractions() {
                this.$emit('requestTouristAttractions', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

