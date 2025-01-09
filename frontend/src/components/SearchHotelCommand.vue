<template>
    <v-card outlined>
        <v-card-title>
            SearchHotel
        </v-card-title>

        <v-card-text>
            <Date label="SearchDate" v-model="value.searchDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="searchHotel"
            >
                SearchHotel
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
        name: 'SearchHotelCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.searchDate = '2025-01-09';
        },
        watch: {
        },
        methods: {
            searchHotel() {
                this.$emit('searchHotel', this.value);
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

